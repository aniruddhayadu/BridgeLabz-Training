package com.reflectionandannotation.annotation.customannotation;

import java.lang.reflect.Method;

public class AnnotationReflection {

    public static void main(String[] args) {

        try {
            // Get class object
            Class<TaskManager> cls = TaskManager.class;

            // Get method
            Method method = cls.getMethod("processTask");

            // Check if annotation exists
            if (method.isAnnotationPresent(TaskInfo.class)) {

                // Retrieve annotation
                TaskInfo taskInfo =
                        method.getAnnotation(TaskInfo.class);

                // Print annotation details
                System.out.println("Priority: " + taskInfo.priority());
                System.out.println("Assigned To: " + taskInfo.assignedTo());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
