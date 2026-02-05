package annotations.beans;

public class SpeakerFactory {
	public static Speaker getSpeaker(String speakerType) {
		if (speakerType.equalsIgnoreCase("sony"))
			return new SonySpeakers();
		else if (speakerType.equalsIgnoreCase("bose"))
			return new BoseSpeakers();

		return null;
	}
}
