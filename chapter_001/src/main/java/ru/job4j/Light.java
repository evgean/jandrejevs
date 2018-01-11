package ru.job4j;

public class Light {
	public void xml(int starId, int count, int porsion, double step) {
		int repead = starId;
		for (int j = 0; j < porsion; j++) {
			int loop = count + starId;
			double timingOffset = 0.25D;
			for (int i = starId; i < loop; i++) {
				System.out.println("    <RunningLight>");
				System.out.println("      <MeshName>#Runninglight" + repead + "</MeshName>");
				System.out.println("      <Position>");
				System.out.println("        <X>0</X>");
				System.out.println("        <Y>0</Y>");
				System.out.println("        <Z>0</Z>");
				System.out.println("      </Position>");
				System.out.println("      <Color>");
				System.out.println("        <R>0</R>");
				System.out.println("        <G>255</G>");
				System.out.println("        <B>0</B>");
				System.out.println("        <A>255</A>");
				System.out.println("      </Color>");
				System.out.println("      <TimingOffset>" + timingOffset + "</TimingOffset>");
				System.out.println("      <LightTimeOn>0.5</LightTimeOn>");
				System.out.println("      <LightTimeOff>0.5</LightTimeOff>");
				System.out.println("    </RunningLight>");
				
				timingOffset = timingOffset + step;
				timingOffset = Math.round(timingOffset * 1000);
				timingOffset = timingOffset / 1000;
				
				repead++;
			}
		}
	}
	
	public static void main(String[] args) {
		Light some = new Light();
		some.xml(0, 5, 5, 0.2);
	}
}