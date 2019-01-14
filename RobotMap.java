/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team31.robot;

import org.usfirst.frc.team31.robot.subsystems.DriveTrain_Subsystem;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	public static WPI_VictorSPX driveTrain_subsystemTalonSRX1;
	public static WPI_VictorSPX driveTrain_subsystemTalonSRX2;
	public static WPI_VictorSPX driveTrain_subsystemTalonSRX3;
	public static WPI_VictorSPX driveTrain_subsystemTalonSRX4;
	public static WPI_VictorSPX driveTrain_subsystemTalonSRX5;

	public static SpeedControllerGroup LeftSide;
	public static SpeedControllerGroup RightSide;
	
	public static DifferentialDrive driveTrain_subsystemDriveTrain1;
	public static DriveTrain_Subsystem driveSystem;
	// For example to map the left and right motors, you could define the
	// following variables to use with your drivetrain subsystem.
	// public static int leftMotor = 1;
	// public static int rightMotor = 2;

	// If you are using multiple modules, make sure to define both the port
	// number and the module. For example you with a rangefinder:
	// public static int rangefinderPort = 1;
	// public static int rangefinderModule = 1;
}
