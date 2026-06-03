class Config {
    static String company;

    static {
        company = "OpenAI";
        System.out.println("Static Block Executed");
    }
}

public class StaticBlockDemo {
    public static void main(String[] args) {
        System.out.println("Company: " + Config.company);
    }
}