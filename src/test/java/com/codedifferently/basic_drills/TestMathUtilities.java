package com.codedifferently.basic_drills;

import com.codedifferently.basic_drills.mathutilities.TestAddition;
import com.codedifferently.basic_drills.mathutilities.TestMultiplication;
import com.codedifferently.basic_drills.mathutilities.TestSubtraction;
import com.codedifferently.basic_drills.mathutilities.TestDivision;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;


@RunWith(Suite.class)
@Suite.SuiteClasses({
        TestAddition.class,
        TestSubtraction.class,
        TestDivision.class,
        TestMultiplication.class
})
public class TestMathUtilities {
}