public class LearnMain {
    public static void main(String[] args) {
        String text = "All the Lorem Ipsum generators on the Internet tend to repeat predefined chunks as necessary, making this the first true generator on the Internet. It uses a dictionary of over 200 Latin words, combined with a handful of model sentence structures, to generate Lorem Ipsum which looks reasonable. The generated Lorem Ipsum is therefore always free from repetition, injected humour, or non-characteristic words etc.";
        for ( int i = 0; i < text.length(); i++) {
            char symb = text.charAt(i);
            if (symb == ',') {
                System.out.println("comma is found");
            }
            if (symb == '.') {
                System.out.println("period is found");
            }
        }
    }
}
