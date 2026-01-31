package com.chatlogparser;

public interface MessageFilter<T> {

    // Returns true if message should be included
    boolean allow(T message);
}
