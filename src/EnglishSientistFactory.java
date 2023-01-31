public class EnglishSientistFactory implements AbstractScientistFactory{
    @Override
    public Doctor createDocor() {
        return new EnglishDoctor();
    }

    @Override
    public Engineer createEngeneer() {
        return new EnglishEngineer();
    }
}
