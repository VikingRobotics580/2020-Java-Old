package frc.robot;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.TimedRobot;

public class Robot extends TimedRobot {
  TalonSRX _talon0 = new TalonSRX(0); // Change '0' to match device ID in Tuner.  Use VictorSPX for Victor SPXs
  Joystick _joystick = new Joystick(0);

  @Override
  public void teleopPeriodic() {
    double stick = _joystick.getRawAxis(1);
    _talon0.set(ControlMode.PercentOutput, stick);
  }
}