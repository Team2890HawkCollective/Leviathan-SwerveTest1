/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.ClimberSubsystem;

public class ClimberCommand extends CommandBase {
  private final ClimberSubsystem m_climberSubsystem;
  /**
   * Creates a new ClimberCommand.
   */
  public ClimberCommand(ClimberSubsystem subsystem) {

    // Use addRequirements() here to declare subsystem dependencies.
    m_climberSubsystem = subsystem;
    addRequirements(subsystem);
  }


  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
  }

  // Called every time the scheduler runs while the command is scheduled.
  // Calls which drive mode we're going to use during competitions
  @Override
  public void execute() {
    //System.out.println("DEVCHECK ClimberCommand.execute"); // floods the RioLog. be careful
    //m_driveTrainSubsystem.joystickArcadeDrive();
    m_climberSubsystem.xboxArcadeDrive();
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
