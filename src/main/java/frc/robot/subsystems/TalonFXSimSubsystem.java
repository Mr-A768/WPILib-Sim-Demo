// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix6.hardware.TalonFX;
import com.ctre.phoenix6.sim.TalonFXSimState;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class TalonFXSimSubsystem extends SubsystemBase {

  TalonFX talonFX = new TalonFX(1);
  TalonFXSimState talonFXSim = talonFX.getSimState();

  /** Creates a new TalonFXSimSubsystem. */
  public TalonFXSimSubsystem() {
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  public void setSpeed(double speed){ // Sets duty cycle speed
    talonFX.set(speed);
  }

  public void setVelocity(double rpm){ // Sets velocity in rpm
    talonFXSim.setRotorVelocity(rpm);
  }

}
