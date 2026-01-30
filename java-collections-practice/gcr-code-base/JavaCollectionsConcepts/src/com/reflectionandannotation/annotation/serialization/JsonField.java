package com.reflectionandannotation.annotation.serialization;

@Retention(RetentionPolicy.RUNTIME) // Needed for reflection
@Target(ElementType.FIELD) // Apply to fields only
public @interface JsonField {
	String name();
} 	
