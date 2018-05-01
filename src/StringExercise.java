public class StringExercise {
    public static void main(String[] args) {
        String message = "We don't need no education We don't need no thought control Check \"this\" out!, \"s inside of \"s! I can do backslashes \\, double backslashes \\\\,\nand the amazing triple backslash \\\\\\!\n";
//        System.out.println(message.indexOf("education"));
//        System.out.println(message.indexOf("thought control"));
//        System.out.println(message.indexOf("Check"));
//        System.out.println(message.indexOf("I can do"));
//        System.out.println(message.indexOf("and the amazing"));
        System.out.println(message.substring(0,26) + "\n" + message.substring(27,60) + "\n" + message.substring(60,96) + "\n" + message.substring(96));



    }
}
