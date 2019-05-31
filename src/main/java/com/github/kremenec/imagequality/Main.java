package com.github.kremenec.imagequality;

import com.github.romankh3.image.comparison.ImageComparison;
import com.github.romankh3.image.comparison.ImageComparisonUtil;
import com.github.romankh3.image.comparison.model.ComparisonResult;
import java.io.IOException;
import java.net.URISyntaxException;

public class Main {

    public static void main(String[] args) throws IOException, URISyntaxException {
        ImageComparison imageComparison = new ImageComparison("image1.png", "image2.png");

        imageComparison.setRectangleLineWidth(10);

        ComparisonResult comparisonResult = imageComparison.compareImages();

        ImageComparisonUtil.createGUI(comparisonResult.getResult());
    }

}
