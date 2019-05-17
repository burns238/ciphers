package dataencryptionstandard

import org.scalatest._

class BitFunctionsSpec extends FlatSpec with Matchers {

  "stringToBits" should "convert a single character to a vector representing its bits" in {
  	BitFunctions.stringToBits(AString) shouldEqual ABits
  }

  it should "convert a short word to a vector representing its bits" in {
    BitFunctions.stringToBits(MikeString) shouldEqual MikeBits
  }

  it should "convert a sentence to a vector representing its bits" in {
    BitFunctions.stringToBits(LoremIpsum) shouldEqual LoremIpsumBits
  }

  "bitsToString" should "convert bits representing a character to its string representation" in {
    BitFunctions.bitsToString(ABits) shouldEqual AString
  }

  it should "convert bits representing a short word to its string representation" in {
    BitFunctions.bitsToString(MikeBits) shouldEqual MikeString
  }

  it should "convert bits representing a sentence to its string representation" in {
    BitFunctions.bitsToString(LoremIpsumBits) shouldEqual LoremIpsum
  } 

  "leftShift" should "move all bits two to the left where the distance is 2" in {
    val bits = Vector('0','0','1','1')
    val expectedBits = Vector('1','1','0','0')
    BitFunctions.leftShift(bits, 2) shouldEqual expectedBits
  }

  it should "move all bits two to the left where the distance is 3" in {
    val bits = Vector('0','0','1','1')
    val expectedBits = Vector('1','0','0','1')
    BitFunctions.leftShift(bits, 3) shouldEqual expectedBits
  }

  it should "move all bits ten to the left where the distance is 10" in {
    val bits = Vector('0','0','1','1','0','0','1','1','0','0','1','1','0','0','1','1')
    val expectedBits = Vector('1','1','0','0','1','1','0','0','1','1','0','0','1','1','0','0')
    BitFunctions.leftShift(bits, 10) shouldEqual expectedBits
  }

  val AString = "a"
  val ABits = Vector('0','1','1','0','0','0','0','1')

  val MikeString = "Mike"
  val MikeBits = 
      Vector('0','1','0','0','1','1','0','1',
       '0','1','1','0','1','0','0','1',
       '0','1','1','0','1','0','1','1',
       '0','1','1','0','0','1','0','1')

  val LoremIpsum = "Lorem ipsum is placeholder text commonly used in the graphic, print, and publishing industries for previewing layouts and visual mockups."
  val LoremIpsumBits = 
    Vector('0','1','0','0','1','1','0','0',
          '0','1','1','0','1','1','1','1',
          '0','1','1','1','0','0','1','0',
          '0','1','1','0','0','1','0','1',
          '0','1','1','0','1','1','0','1',
          '0','0','1','0','0','0','0','0',
          '0','1','1','0','1','0','0','1',
          '0','1','1','1','0','0','0','0',
          '0','1','1','1','0','0','1','1',
          '0','1','1','1','0','1','0','1',
          '0','1','1','0','1','1','0','1',
          '0','0','1','0','0','0','0','0',
          '0','1','1','0','1','0','0','1',
          '0','1','1','1','0','0','1','1',
          '0','0','1','0','0','0','0','0',
          '0','1','1','1','0','0','0','0',
          '0','1','1','0','1','1','0','0',
          '0','1','1','0','0','0','0','1',
          '0','1','1','0','0','0','1','1',
          '0','1','1','0','0','1','0','1',
          '0','1','1','0','1','0','0','0',
          '0','1','1','0','1','1','1','1',
          '0','1','1','0','1','1','0','0',
          '0','1','1','0','0','1','0','0',
          '0','1','1','0','0','1','0','1',
          '0','1','1','1','0','0','1','0',
          '0','0','1','0','0','0','0','0',
          '0','1','1','1','0','1','0','0',
          '0','1','1','0','0','1','0','1',
          '0','1','1','1','1','0','0','0',
          '0','1','1','1','0','1','0','0',
          '0','0','1','0','0','0','0','0',
          '0','1','1','0','0','0','1','1',
          '0','1','1','0','1','1','1','1',
          '0','1','1','0','1','1','0','1',
          '0','1','1','0','1','1','0','1',
          '0','1','1','0','1','1','1','1',
          '0','1','1','0','1','1','1','0',
          '0','1','1','0','1','1','0','0',
          '0','1','1','1','1','0','0','1',
          '0','0','1','0','0','0','0','0',
          '0','1','1','1','0','1','0','1',
          '0','1','1','1','0','0','1','1',
          '0','1','1','0','0','1','0','1',
          '0','1','1','0','0','1','0','0',
          '0','0','1','0','0','0','0','0',
          '0','1','1','0','1','0','0','1',
          '0','1','1','0','1','1','1','0',
          '0','0','1','0','0','0','0','0',
          '0','1','1','1','0','1','0','0',
          '0','1','1','0','1','0','0','0',
          '0','1','1','0','0','1','0','1',
          '0','0','1','0','0','0','0','0',
          '0','1','1','0','0','1','1','1',
          '0','1','1','1','0','0','1','0',
          '0','1','1','0','0','0','0','1',
          '0','1','1','1','0','0','0','0',
          '0','1','1','0','1','0','0','0',
          '0','1','1','0','1','0','0','1',
          '0','1','1','0','0','0','1','1',
          '0','0','1','0','1','1','0','0',
          '0','0','1','0','0','0','0','0',
          '0','1','1','1','0','0','0','0',
          '0','1','1','1','0','0','1','0',
          '0','1','1','0','1','0','0','1',
          '0','1','1','0','1','1','1','0',
          '0','1','1','1','0','1','0','0',
          '0','0','1','0','1','1','0','0',
          '0','0','1','0','0','0','0','0',
          '0','1','1','0','0','0','0','1',
          '0','1','1','0','1','1','1','0',
          '0','1','1','0','0','1','0','0',
          '0','0','1','0','0','0','0','0',
          '0','1','1','1','0','0','0','0',
          '0','1','1','1','0','1','0','1',
          '0','1','1','0','0','0','1','0',
          '0','1','1','0','1','1','0','0',
          '0','1','1','0','1','0','0','1',
          '0','1','1','1','0','0','1','1',
          '0','1','1','0','1','0','0','0',
          '0','1','1','0','1','0','0','1',
          '0','1','1','0','1','1','1','0',
          '0','1','1','0','0','1','1','1',
          '0','0','1','0','0','0','0','0',
          '0','1','1','0','1','0','0','1',
          '0','1','1','0','1','1','1','0',
          '0','1','1','0','0','1','0','0',
          '0','1','1','1','0','1','0','1',
          '0','1','1','1','0','0','1','1',
          '0','1','1','1','0','1','0','0',
          '0','1','1','1','0','0','1','0',
          '0','1','1','0','1','0','0','1',
          '0','1','1','0','0','1','0','1',
          '0','1','1','1','0','0','1','1',
          '0','0','1','0','0','0','0','0',
          '0','1','1','0','0','1','1','0',
          '0','1','1','0','1','1','1','1',
          '0','1','1','1','0','0','1','0',
          '0','0','1','0','0','0','0','0',
          '0','1','1','1','0','0','0','0',
          '0','1','1','1','0','0','1','0',
          '0','1','1','0','0','1','0','1',
          '0','1','1','1','0','1','1','0',
          '0','1','1','0','1','0','0','1',
          '0','1','1','0','0','1','0','1',
          '0','1','1','1','0','1','1','1',
          '0','1','1','0','1','0','0','1',
          '0','1','1','0','1','1','1','0',
          '0','1','1','0','0','1','1','1',
          '0','0','1','0','0','0','0','0',
          '0','1','1','0','1','1','0','0',
          '0','1','1','0','0','0','0','1',
          '0','1','1','1','1','0','0','1',
          '0','1','1','0','1','1','1','1',
          '0','1','1','1','0','1','0','1',
          '0','1','1','1','0','1','0','0',
          '0','1','1','1','0','0','1','1',
          '0','0','1','0','0','0','0','0',
          '0','1','1','0','0','0','0','1',
          '0','1','1','0','1','1','1','0',
          '0','1','1','0','0','1','0','0',
          '0','0','1','0','0','0','0','0',
          '0','1','1','1','0','1','1','0',
          '0','1','1','0','1','0','0','1',
          '0','1','1','1','0','0','1','1',
          '0','1','1','1','0','1','0','1',
          '0','1','1','0','0','0','0','1',
          '0','1','1','0','1','1','0','0',
          '0','0','1','0','0','0','0','0',
          '0','1','1','0','1','1','0','1',
          '0','1','1','0','1','1','1','1',
          '0','1','1','0','0','0','1','1',
          '0','1','1','0','1','0','1','1',
          '0','1','1','1','0','1','0','1',
          '0','1','1','1','0','0','0','0',
          '0','1','1','1','0','0','1','1',
          '0','0','1','0','1','1','1','0')

}