package gr.aueb.cf.ch17.runnable;

public class KillTheDragonMission implements IMission {
    private MissionStatus status = MissionStatus.NOT_STARTED;
    @Override
    public MissionStatus getStatus() {
        return status;
    }

    @Override
    public void setStatus(MissionStatus status) {
        this.status = status;
    }

    @Override
    public void embark() {
        System.out.println("Kill the Dragon");

    }
}
