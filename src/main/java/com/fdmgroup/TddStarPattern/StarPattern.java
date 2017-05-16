package com.fdmgroup.TddStarPattern;

public class StarPattern {

	public String makeTrianglePattern(int height){
		
		String trianglePattern = "";
		
		for(int row = 1; row <= height; row++){
			int numberOfSpacesBeforeFirstStar = height - row;			
			int numberOfStars = row*2 - 1;
			
			trianglePattern += makeLineOfStars(numberOfSpacesBeforeFirstStar, numberOfStars);
			
			if(row != height)
				trianglePattern += "\n";
		}
		
//		System.out.println(trianglePattern);
		return trianglePattern;
	}

	public String makeDiamondPattern(int height) {
		
		String diamondPattern = "";
		
		int heightOfUpperTriangle = (height + 1) / 2;
		
		diamondPattern += this.makeTrianglePattern(heightOfUpperTriangle);
		
		if(height > 1) {
			 diamondPattern += "\n";
			
			for(int row = heightOfUpperTriangle + 1; row <= height; row++) {
				int numberOfSpacesBeforeFirstStar = row - heightOfUpperTriangle;				
				int numberOfStars = height - numberOfSpacesBeforeFirstStar*2;
				
				diamondPattern += makeLineOfStars(numberOfSpacesBeforeFirstStar, numberOfStars);
				
				if(row != height)
					diamondPattern += "\n";
			}
		}		
		
//		System.out.println(diamondPattern);
		return diamondPattern;
	}

	public String makeNumberPattern(int height) {
		
		String numberPattern = "";
		
		for(int row = 1; row <= height; row++){
			int numberOfSpacesBeforeFirstStar = height - row;
			for(int spaceCounter = 0; spaceCounter < numberOfSpacesBeforeFirstStar; spaceCounter++){
				numberPattern += " ";
			}
			
			int numberOfNumbers = row*2 - 1;
			for(int starCounter = 0; starCounter < numberOfNumbers; starCounter++) {
				numberPattern += starCounter;
			}
			
			if(row != height)
				numberPattern += "\n";
		}
		
//		System.out.println(numberPattern);
		return numberPattern;
	}
	
	private String makeLineOfStars(int numberOfSpacesBeforeTheStars, int numberOfStars) {
		String line = "";
		
		for(int spaceCounter = 0; spaceCounter < numberOfSpacesBeforeTheStars; spaceCounter++) {
			line += " ";
		}
		for(int starCounter = 0; starCounter < numberOfStars; starCounter++) {
			line += "*";
		}
		
		return line;
	}
	
}
















