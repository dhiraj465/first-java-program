//break using for loop

class Break_01 {

    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i <= 5; i++) {
            System.out.println(i);

            if (i == 2) {
                System.out.println("Ending this loop");
                break;
                // continue
            }
        }
    }
}

// break using while loop
