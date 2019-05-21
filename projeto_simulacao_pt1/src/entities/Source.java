package entities;

import eduni.simjava.*;

public class Source extends Entity {      // The class for the source
  private Sim_port out;

  public Source(String name, double mean, double avg) {
    super(name, mean, avg, 0, new double[]{1.0});
  }

  public void body() {
    for (int i = 0; i < 100; i++) {
      sim_schedule(outPorts[0], 0.0, 0);       // Send the load balancer a job
      sim_pause(sample());
    }
  }
}