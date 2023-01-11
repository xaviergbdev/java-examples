public class Main {


    public static void main(String[] args) {

        CocheCRUD cocheCRUD  = new CocheCRUDlmpl();

        cocheCRUD.save();
        cocheCRUD.findAll();
        cocheCRUD.delete();
    }
}
