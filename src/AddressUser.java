import java.util.Scanner;


public class AddressUser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AddressBook adrBook = new AddressBook();
        list();
        int com, ind;
        String name, phone, email;

        name = "Иван";
        phone = "83694895204";
        email = "Ivan@mail.com";
        Address adr = new Address(name, phone, email);
        adrBook.add(adr);
        name = "Семен";
        phone = "85893025485";
        email = "Semen@mail.com";
        adr = new Address(name, phone, email);
        adrBook.add(adr);

        while (true) {
            com = sc.nextInt();
            switch (com) {
                case 1:
                    System.out.print("Введите имя: ");
                    name = sc.next();
                    System.out.print("Введите номер телефона: ");
                    phone = sc.next();
                    System.out.print("Введите E-mail: ");
                    email = sc.next();
                    adr = new Address(name, phone, email);
                    adrBook.add(adr);
                    break;
                case 2:
                    System.out.print("Введите имя: ");
                    name = sc.next();
                    adrBook.find(name);
                    System.out.println();
                    break;
                case 3:
                    adrBook.print();
                    break;
                case 4:
                    System.out.print("Введите индекс удаляемой записи: ");
                    ind = sc.nextInt();
                    adrBook.delete(ind);
                    break;
                case 5:
                    System.out.print("Введите индекс изменяемой записи: ");
                    ind = sc.nextInt();
                    System.out.print("Введите новое имя: ");
                    name = sc.next();
                    System.out.print("Введите новый номер телеона: ");
                    phone = sc.next();
                    System.out.print("Введите новый Email: ");
                    email = sc.next();
                    adrBook.change(ind, name, phone, email);
                    break;
                case 6:
                    System.out.print("Введите индекс записи: ");
                    ind = sc.nextInt();
                    adrBook.get(ind);
                    break;
                case 7:
                    System.out.println("Количество записей в книге: " + adrBook.getCount());
                    break;
                case 8:
                    list();
                    break;
                case 9:
                    return;
                default:
                    System.out.print("Введите корректную команду: ");
            }
        }
    }
    public static void list(){
        System.out.println("Введите номер команды для ее выполнения: \n" +
                "1 - добавить запись\n" +
                "2 - поиск записей\n" +
                "3 - вывод всех записей\n" +
                "4 - удаление записи\n" +
                "5 - изменение записи\n" +
                "6 - вывести запись по индексу\n" +
                "7 - вывести количество записей в книге\n" +
                "8 - вывести меню пользователя\n" +
                "9 - выход из программы\n");
    }
}
