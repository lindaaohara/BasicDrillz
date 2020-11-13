package com.codedifferently.basic_drills;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)

@Suite.SuiteClasses({
        TestPredicateUtilities.class,
        TestMathUtilities.class,
        TestStringUtilities.class,
})
public class TestSuite {
}
