public class Printer {
    public static void main(String[] args) {
        String name1;
        String name2;
        String name3;
        String name4;
        String name5;
        String name6;
        String name7;
        String name8;
        int phone1;
        int phone2;
        int phone3;
        int phone4;
        int phone5;
        int phone6;
        int phone7;
        int phone8;

        if (args.length == 0) {
            name1 = "Ivanov";
            name2 = "Petrov";
            name3 = "Sidorov";
            name4 = "Kulebyaka";
            name5 = "Funtikov";
            name6 = "Petushkov";
            name7 = "Medvedev";
            name8 = "Gagin";

            phone1 = 123456;
            phone2 = 654321;
            phone3 = 546856;
            phone4 = 532553;
            phone5 = 532553;
            phone6 = 546864;
            phone7 = 546899;
            phone8 = 324568;

        } else {
            name1 = args[0];
            name2 = args[1];
            name3 = args[2];
            name4 = args[3];
            name5 = args[4];
            name6 = args[5];
            name7 = args[6];
            name8 = args[7];

            phone1 = Integer.parseInt(args[2]);
            phone2 = Integer.parseInt(args[3]);
            phone3 = Integer.parseInt(args[4]);
            phone4 = Integer.parseInt(args[5]);
            phone5 = Integer.parseInt(args[6]);
            phone6 = Integer.parseInt(args[7]);
            phone7 = Integer.parseInt(args[8]);
            phone8 = Integer.parseInt(args[9]);
        }

        PhoneBook myPhoneBook = new PhoneBook();
        myPhoneBook.add(name1, phone1);
        myPhoneBook.add(name1, phone2);
        myPhoneBook.add(name2, phone2);
        myPhoneBook.add(name2, phone3);
        myPhoneBook.add(name3, phone4); // пытаемся добавить два одинаковых номера в запись name 3 = "Sidorov"
        myPhoneBook.add(name3, phone5); //
        myPhoneBook.add(name4, phone4);
        myPhoneBook.add(name5, phone4);
        myPhoneBook.add(name5, phone6);
        myPhoneBook.add(name5, phone7);
        myPhoneBook.add(name6, phone8);
        myPhoneBook.add(name7, phone1);
        myPhoneBook.add(name8, phone4);

        System.out.println("PhoneNumbers for " + name1 +": " + myPhoneBook.find(name1)); // ищем телефоны для имени name1 =
                                                                                   // "Ivanov"
        System.out.println();
        PhoneBook.getPhoneBook(); // выводим всю книгу с сортировкой по количеству телефонов
        System.out.println();
        System.out.println("PhoneNumbers for " + "Me" + ": "+ myPhoneBook.find("Me")); // ищем телефоны по имени, которого нет
                                                                                 // в книге
    }

}
