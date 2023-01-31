public class Main {
    public static void main(String[] args) {
       AbstractScientistFactory abstractScientistFactory = new UkrainianSientistFactory();
       abstractScientistFactory.createDocor().getInformationAboutLenguage();
       abstractScientistFactory.createEngeneer().getInformationAboutLenguage();
    }
}