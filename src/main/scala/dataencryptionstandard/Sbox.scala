package dataencryptionstandard

import dataencryptionstandard.BitMappings._
import dataencryptionstandard.BitFunctions._

object Sbox {
	
	def applySboxes(bits: Vector[Char]): Vector[Char] = {
		val bytes = bits.grouped(6).toVector
		(for (i <- 0 to 7) yield mapByteUsingSbox(bytes(i), Sboxs(i))).toVector.flatten
	}

	def mapByteUsingSbox(bits: Vector[Char], sbox: Vector[Vector[Int]]): Vector[Char] = {
		// The first and last bits determine the first dimension in the lookup table,
		//  the middle 4 characters determine the second
		val firstDim = intFromBits(Vector(bits(0),bits(5)))
		val secondDim = intFromBits(Vector(bits(1),bits(2),bits(3),bits(4)))
		val mappedInt = sbox(firstDim)(secondDim)
		padLeftZeros(mappedInt.toBinaryString, 4).toVector
	}

	private def intFromBits(bits: Vector[Char]) = Integer.parseInt(bits.mkString, 2)

}