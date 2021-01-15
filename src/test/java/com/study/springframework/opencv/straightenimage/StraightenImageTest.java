package com.study.springframework.opencv.straightenimage;

import com.study.springframework.AbstractSpringFrameworkStudyTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class StraightenImageTest extends AbstractSpringFrameworkStudyTest {
    @Autowired
    private StraightenImage instanceUnderTest;

    //@Test
    public void straitenImageTest() {
        instanceUnderTest.straitenImage();
    }
}
