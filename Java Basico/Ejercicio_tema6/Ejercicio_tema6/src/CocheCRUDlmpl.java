public class CocheCRUDlmpl implements CocheCRUD{
    @Override
    public void save() {
        System.out.println("Metodo save");
    }

    @Override
    public void findAll() {
        System.out.println("Metodo findAll");
    }

    @Override
    public void delete() {
        System.out.println("Metodo delete");
    }
}
