public class nemo {
    public static void main(String args[]) {
        String[] characters = {"Dorthy", "Marlin", "Nemo", "Gill", "Peach"};

        for (int i = 0; i < characters.length; i++) {
            if (characters[i] == "Nemo") {
                System.out.println("We found Nemo !!");
                break;
            } else {
                System.out.println("We found "+ characters[i]+" instead");
            }


        }

    }
}
