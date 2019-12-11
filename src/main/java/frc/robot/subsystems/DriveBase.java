/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;


import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * Add your docs here.
 */
public class DriveBase extends Subsystem {
  VictorSPX driveFL;
  VictorSPX driveFR;
  VictorSPX driveBL;
  VictorSPX driveBR;
  public DriveBase(){
    driveFL = new VictorSPX(0);
    driveFR = new VictorSPX(1);
    driveBL = new VictorSPX(2);
    driveBR = new VictorSPX(3);
  }
  public void drive (double leftjoy, double rightjoy)
  {
    driveFL.set(ControlMode.PercentOutput , leftjoy);
    driveFR.set(ControlMode.PercentOutput , leftjoy);
    driveBL.set(ControlMode.PercentOutput , rightjoy);
    driveBR.set(ControlMode.PercentOutput , rightjoy);

  }
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
}
