package com.eduresults;

public class EduResult {

    public static Student[] scoreList = new Student[10];
    private static int index = 0;

    public static void addStudent(String name, int score, String testCenter) {
        if (index < scoreList.length) {
            scoreList[index] = new Student(name, score, testCenter);
            index++;
        } else {
            System.out.println("Student score list is full");
        }
    }

    public static void displayInfo() {
        System.out.println("--------------------------------");
        System.out.println("Displaying Student details");
        System.out.println("--------------------------------");
        System.out.println("Name\tScore\tDistrict");
        System.out.println("--------------------------------");

        for (int i = 0; i < index; i++) {
            System.out.println(
                    scoreList[i].name + "\t" +
                    scoreList[i].score + "\t" +
                    scoreList[i].district
            );
        }
    }

    
    
    public static void mergeSort(Student[] arr, int l, int r) {
        if (l < r) {
            int m = l + (r - l) / 2;

            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);

            merge(arr, l, m, r);
        }
    }

    private static void merge(Student[] arr, int l, int m, int r) {

        int n1 = m - l + 1;
        int n2 = r - m;

        Student[] L = new Student[n1];
        Student[] R = new Student[n2];

        for (int i = 0; i < n1; i++)
            L[i] = arr[l + i];

        for (int j = 0; j < n2; j++)
            R[j] = arr[m + 1 + j];

        int i = 0, j = 0, k = l;

        while (i < n1 && j < n2) {
            if (L[i].district.compareTo(R[j].district) <= 0) {
                arr[k++] = L[i++];
            } else {
                arr[k++] = R[j++];
            }
        }

        while (i < n1) {
            arr[k++] = L[i++];
        }

        while (j < n2) {
            arr[k++] = R[j++];
        }
    }

    public static void sortScore(Student[] arr) {
        int i = 0;
        int j = 0;

        while (j < index) {
            if (!arr[i].district.equals(arr[j].district)) {
                mergeSortScore(arr, i, j - 1);
                i = j;
            }
            j++;
        }
        mergeSortScore(arr, i, j - 1);
    }

    public static void mergeSortScore(Student[] arr, int l, int r) {
        if (l < r) {
            int m = (l + r) / 2;

            mergeSortScore(arr, l, m);
            mergeSortScore(arr, m + 1, r);

            mergeScore(arr, l, m, r);
        }
    }

    private static void mergeScore(Student[] arr, int l, int m, int r) {

        int n1 = m - l + 1;
        int n2 = r - m;

        Student[] L = new Student[n1];
        Student[] R = new Student[n2];

        for (int i = 0; i < n1; i++)
            L[i] = arr[l + i];

        for (int j = 0; j < n2; j++)
            R[j] = arr[m + 1 + j];

        int i = 0, j = 0, k = l;

        // Stable sorting by score
        while (i < n1 && j < n2) {
            if (L[i].score <= R[j].score) {
                arr[k++] = L[i++];
            } else {
                arr[k++] = R[j++];
            }
        }

        while (i < n1) {
            arr[k++] = L[i++];
        }

        while (j < n2) {
            arr[k++] = R[j++];
        }
    }

    public static void main(String[] args) {

        addStudent("Princi", 172, "Sagar");
        addStudent("Anni", 180, "Harda");
        addStudent("Arif", 165, "Rewa");
        addStudent("Nikki", 158, "Bhopal");
        addStudent("Aditya", 190, "Rewa");
        addStudent("Rohan", 145, "Harda");
        addStudent("Neha", 168, "Bhopal");
        addStudent("Hanuman", 155, "Rewa");
        addStudent("Abhi", 182, "Katani");
        addStudent("Anurag", 160, "Harda");

        displayInfo();

        System.out.println("\nStudent list sorted District wise");
        mergeSort(scoreList, 0, index - 1);
        displayInfo();

        System.out.println("\nStudent list sorted Score wise inside each District");
        sortScore(scoreList);
        displayInfo();
    }
}
