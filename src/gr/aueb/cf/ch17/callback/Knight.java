package gr.aueb.cf.ch17.callback;

import gr.aueb.cf.ch17.callback.IKnight;
import gr.aueb.cf.ch17.callback.IMission;

public class Knight implements IKnight {

    @Override
    public void embarkOnMission(IMission mission) {
        mission.embark();

    }
}
