package com.edumentor;

class Learner extends User implements ICertifiable {
    private boolean fullTime;

    public Learner(String name, String email, int userId, boolean fullTime) {
        super(name, email, userId);
        this.fullTime = fullTime;
    }
    
    public void generateCertificate() {
        if (fullTime) {
            System.out.println("Generating Full-Time Course Certificate for " + name);
        } else {
            System.out.println("Generating Short Course Certificate for " + name);
        }
    }
}
