// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.TalonFXSimSubsystem;

public class TalonFXSimCommand extends Command {

  TalonFXSimSubsystem m_TalonFXSimSubsystem;
  double speed;

  /** Creates a new TalonFXSimCommand. */
  public TalonFXSimCommand(TalonFXSimSubsystem talonFXSimSubsystem, double speed) {
    m_TalonFXSimSubsystem = talonFXSimSubsystem;
    this.speed = speed;

    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(talonFXSimSubsystem);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    m_TalonFXSimSubsystem.setSpeed(speed);
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {}

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    m_TalonFXSimSubsystem.setSpeed(0);
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
