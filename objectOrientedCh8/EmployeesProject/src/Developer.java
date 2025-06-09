public class Developer extends Empployee{

    private String languages;
    public Developer(String name, String lastName, int id,String languages) {
        super(name, lastName, id);
        this.languages = languages;
    }

    @Override
    public void showInformation() {
        super.showInformation();
        System.out.println("Language known by Developer: "+languages);
    }
    public void format(String operatingSystem){
        System.out.println(getName() + " is formatting " + operatingSystem );

    }

    public String getLanguages() {
        return languages;
    }

    public void setLanguages(String languages) {
        this.languages = languages;
    }
}
