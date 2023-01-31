public class UkrainianSientistFactory implements  AbstractScientistFactory{
    @Override
    public Doctor createDocor() {
        return new UkrainianDoctor();
    }

    @Override
    public Engineer createEngeneer() {
        return new UkrainianEngineer();
    }
}
