package entities;

public class Source extends Entity { // The class for the source

	public Source(String name, double mean, double avg) {
		super(name, mean, avg, 0, new double[] { 1.0 });
	}

	@Override
	public void body() {
		for (int i = 0; i < 1000; i++) {
			sim_schedule(outPorts[0], 0.0, 0); // Send the load balancer a job
			sim_pause(sample());
		}
	}
}