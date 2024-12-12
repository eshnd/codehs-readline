public class example {
    public static void main(String[] args) {
        String name = readLine("What is your name? ");
        int age = readInt("What is your age? ");
        double height = readDouble("What is your height in meters? ");
        boolean finishedWork = readBoolean("Is your work done? ");

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
        System.out.println("Finished work: " + finishedWork);
    }
}
