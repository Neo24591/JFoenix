package com.cctintl.c3dfx.transitions.hamburger;

import com.fxexperience.javafx.animation.CachedTimelineTransition;

import javafx.animation.Interpolator;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.scene.layout.VBox;
import javafx.scene.shape.SVGPath;
import javafx.util.Duration;

public class HamburgerNextArrowBasicTransition extends CachedTimelineTransition{
	public HamburgerNextArrowBasicTransition(VBox burger) {
		super(burger, new Timeline(
				new KeyFrame(
						Duration.ZERO,       
						new KeyValue(burger.rotateProperty(), 0,Interpolator.EASE_BOTH),
						new KeyValue(burger.getChildren().get(0).rotateProperty(), 0,Interpolator.EASE_BOTH),
						new KeyValue(burger.getChildren().get(0).translateYProperty(), 0,Interpolator.EASE_BOTH),
						new KeyValue(burger.getChildren().get(0).translateXProperty(), 0,Interpolator.EASE_BOTH),
						new KeyValue(burger.getChildren().get(0).scaleXProperty(), 1,Interpolator.EASE_BOTH),
						
						new KeyValue(burger.getChildren().get(2).rotateProperty(), 0,Interpolator.EASE_BOTH),
						new KeyValue(burger.getChildren().get(2).translateYProperty(), 0,Interpolator.EASE_BOTH),
						new KeyValue(burger.getChildren().get(2).translateXProperty(), 0,Interpolator.EASE_BOTH),
						new KeyValue(burger.getChildren().get(2).scaleXProperty(), 1,Interpolator.EASE_BOTH)
						
						),
						new KeyFrame(Duration.millis(1000),
								new KeyValue(burger.rotateProperty(), 0,Interpolator.EASE_BOTH),
								new KeyValue(burger.getChildren().get(0).rotateProperty(), 40,Interpolator.EASE_BOTH),
								new KeyValue(burger.getChildren().get(0).translateYProperty(), ((SVGPath)burger.getChildren().get(0)).getBoundsInLocal().getWidth()/9,Interpolator.EASE_BOTH),
								new KeyValue(burger.getChildren().get(0).translateXProperty(), ((SVGPath)burger.getChildren().get(0)).getBoundsInLocal().getWidth()/4.1,Interpolator.EASE_BOTH),
								new KeyValue(burger.getChildren().get(0).scaleXProperty(), 0.5,Interpolator.EASE_BOTH),
								
								new KeyValue(burger.getChildren().get(2).rotateProperty(), -40,Interpolator.EASE_BOTH),
								new KeyValue(burger.getChildren().get(2).translateYProperty(), -((SVGPath)burger.getChildren().get(2)).getBoundsInLocal().getWidth()/9,Interpolator.EASE_BOTH),
								new KeyValue(burger.getChildren().get(2).translateXProperty(), ((SVGPath)burger.getChildren().get(2)).getBoundsInLocal().getWidth()/4.1,Interpolator.EASE_BOTH),
								new KeyValue(burger.getChildren().get(2).scaleXProperty(), 0.5,Interpolator.EASE_BOTH)
								)
					)
				);
		// reduce the number to increase the shifting , increase number to reduce shifting
		setCycleDuration(Duration.seconds(0.3));
		setDelay(Duration.seconds(0));
	}
}