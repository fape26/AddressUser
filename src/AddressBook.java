public class AddressBook {
    private Address[] book = new Address[10];
    public void add(Address newEntry){
        if (book[book.length - 1] != null) {
            System.out.println(book[book.length - 1].name);
//            Address[] book2 = new Address[book.length];
//            for (int i = 0; i < book2.length; i++) {book2[i] = book[i];}
//            book = new Address[book2.length + 10];
//            for (int i = 0; i < book2.length; i++) {
//                book[i] = book2[i];
//            }
            Address[] book2 = new Address[book.length + 10];
            for (int i = 0; i < book.length; i++) {book2[i] = book[i];}
            book = book2;
        }
        for (int i = 0; i < book.length; i++){
            if (book[i] == null){
                book[i] = newEntry;
                break;
            }
        }
    }
    public void find(String fname){
        boolean count = true;
        for(int i=0; i < book.length; i++){
            if(book[i] != null) {
                if (fname.equals(book[i].name)) {
                    get(i);
                    count = false;
                }
            }
        }
        if(count) System.out.println("Записей не найдено");
    }
    public void get(int index){
        System.out.println("имя: " + book[index].name);
        System.out.println("номер телефона: " + book[index].phone);
        System.out.println("E-mail: " + book[index].email);
    }
    public void print(){
        System.out.println("Индекс / Имя / Телефон / Email");
        for (int i = 0; i < book.length; i++){
            if (book[i] != null) {
                System.out.println(i + " / " + book[i].name + " / " + book[i].phone + " / " + book[i].email);
            }
        }
    }
    public void delete(int index){
        book[index] = null;
    }
    public int getCount(){
        int mas = 0;
        for (int i = 0; i < book.length; i++){
            if (book[i] != null) mas++;
        }
        return mas;
    }
    public void change(int index, String name, String phone, String email){
        book[index] = new Address(name, phone, email);
    }
}
