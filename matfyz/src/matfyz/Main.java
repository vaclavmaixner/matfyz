package matfyz;

public class Main {
	private double kp = 1; // konstanty proporcni, integracni, derivacni
	private double ki = 1;
	private double kd = 1;
	
	Pid pid1 = new Pid();
	pid1.solve(kp, ki, kd);
}
