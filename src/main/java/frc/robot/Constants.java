// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
    //Drive Motors
    public static final int LEFTMOTOR1 = 0;
    public static final int LEFTMOTOR2 = 1;
    public static final int RIGHTMOTOR1 = 2;
    public static final int RIGHTMOTOR2 = 3;


    public static final int LIFTMOTER = 4;
    public static final double LIFTSPEED = 1;
    

    //Joystick Declaration
    public static final int JOYSTICK_LEFT = 0;
    public static final int JOYSTICK_RIGHT = 1;
    public static final int JOYSTICK_LEFTAXIS = 0;
    public static final int JOYSTICK_RIGHTAXIS = 1;
    public static final int JOYSTICK_ROTATEAXIS = 0;

    public static final int LIFTUP_AXIS = 1; // TODO: Give actual IDs
    public static final int LIFTDOWN_AXIS = 2;
    public static final int MOTOR_INTAKE_LEFT_ID = 4;
    public static final int MOTOR_INTAKE_RIGHT_ID = 5;
    public static final int INTAKE_AXIS = 1;
    public static final double XBOX_TOLERANCE = 0.25;
    public static final int INTAKE_SPEED = 1;
    public static final int XBOX_CONTROLLER = 2;
}
