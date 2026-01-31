package com.dealtracker;


import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.regex.*;

// Parses deal text files
public class DealParser {

    // Regex patterns
    private static final Pattern CODE =
            Pattern.compile("DealCode:\\s*(\\w+)");
    private static final Pattern DATE =
            Pattern.compile("ValidTill:\\s*(\\d{2}-\\d{2}-\\d{4})");
    private static final Pattern DISCOUNT =
            Pattern.compile("Discount:\\s*(\\d+)%");
    private static final Pattern MIN_PURCHASE =
            Pattern.compile("MinimumPurchase:\\s*(\\d+)");

    private static final DateTimeFormatter FORMATTER =
            DateTimeFormatter.ofPattern("dd-MM-yyyy");

    // Reads and parses deal file
    public static Map<String, Deal> readDeals(String filePath) {

        Map<String, Deal> dealMap = new HashMap<>();
        Set<String> dealCodes = new HashSet<>();

        try (BufferedReader br = new BufferedReader(
                new InputStreamReader(new FileInputStream(filePath)))) {

            String line;
            String code = null, date = null;
            Integer discount = null, minPurchase = null;

            while ((line = br.readLine()) != null) {

                Matcher m;

                if ((m = CODE.matcher(line)).matches())
                    code = m.group(1);

                else if ((m = DATE.matcher(line)).matches())
                    date = m.group(1);

                else if ((m = DISCOUNT.matcher(line)).matches())
                    discount = Integer.parseInt(m.group(1));

                else if ((m = MIN_PURCHASE.matcher(line)).matches())
                    minPurchase = Integer.parseInt(m.group(1));

                // Blank line indicates end of one deal
                if (line.trim().isEmpty() && code != null) {

                    LocalDate validTill =
                            LocalDate.parse(date, FORMATTER);

                    // Skip expired or duplicate deals
                    if (!validTill.isBefore(LocalDate.now())
                            && dealCodes.add(code)) {

                        dealMap.put(code,
                                new Deal(code, validTill,
                                        discount, minPurchase));
                    }

                    // Reset for next deal
                    code = date = null;
                    discount = minPurchase = null;
                }
            }

        } catch (Exception e) {
            System.out.println("Error reading deals: " + e.getMessage());
        }

        return dealMap;
    }
}
