//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    Scanner scanner = new Scanner(System.in);
    int i=0;
    boolean incorrect;
    String seguir = "si";
//while desea continuar
    while (seguir.equalsIgnoreCase("si")) {
        //while ERROR
        do {
            incorrect = false;

            int opcion = 0;
            System.out.println("MENU\n");

            opcion = scanner.nextInt();
            scanner.nextLine();
            switch (opcion) {
                case 1:

                    break;

                default:
                    System.out.println("ERROR defaulting to main MENU\n");
                    incorrect = true;
                    break;
            }
        } while (incorrect);
        System.out.println("Desea continuar en el MENU? \nSi-No\n");
        seguir = scanner.nextLine();
        scanner.nextLine();
    }




}




