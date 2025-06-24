public class Assci_Values
{
	public static void main(String args[])
	{
		
		for(int i = 0; i<=255; i++)
		{
			System.out.println(i+" "+(char)i);
		}
		
		/* 
			ASCII - AMERICAN STANDARD CODE FOR INFORMATION INTERCHANGE.
			
			Total, We have 127 ASCII VALUES BUT NEWLY UPDATE THE ASCCI VALUES UPTO 255. 
			
			1-31 ASCII VALUES - ARE NOT PRINTABLE -> USING FOR SOME FUNCTIONS LIKE TAB, ENTER ,ETC. THESE KEYS ARE CALLED AS CONTROL CHARACTERS.
			
			32 -126 ASCII VALUES - ARE PRINTABLE -> USING FOR SPECIAL CHARACTERS, NUMBERS ALPHA, SYMBOLS ,ETC. THESE KEYS ARE CALLED AS PRINTABLE CHARACTERS.
			
			127 - ASCCI VALUE - ARE NOT PRINTABLE -> IT IS DEL KEY. THIS ONE IS NON PRINTABLE DELETE CHARACTER .
			
			Printable ASCII Characters (95 usable characters)
			
				These are visible, readable, and used in programming and text.
			
				Space and Symbols: (32–47, 58–64, 91–96, 123–126)
				
				Digits (48-57)-> 0-9.
				
				Uppercase Letters: (65–90)-> A-Z.
				
				Lowercase Letters: (97–122)-> a-z.
				
			Non-Printable Control Characters (32 characters) :
				
				Used for control, formatting, or transmission. Not visible on screen.
			
				| ASCII | Name                 | ASCII | Name |
				| ----- | -------------------- | ----- | ---- |
				| 0     | NULL                 | 16    | DLE  |
				| 1     | SOH                  | 17    | DC1  |
				| 2     | STX                  | 18    | DC2  |
				| 3     | ETX                  | 19    | DC3  |
				| 4     | EOT                  | 20    | DC4  |
				| 5     | ENQ                  | 21    | NAK  |
				| 6     | ACK                  | 22    | SYN  |
				| 7     | BEL (beep)           | 23    | ETB  |
				| 8     | BS (backspace)       | 24    | CAN  |
				| 9     | TAB                  | 25    | EM   |
				| 10    | LF (Line Feed)       | 26    | SUB  |
				| 11    | VT (Vertical Tab)    | 27    | ESC  |
				| 12    | FF (Form Feed)       | 28    | FS   |
				| 13    | CR (Carriage Return) | 29    | GS   |
				| 14    | SO                   | 30    | RS   |
				| 15    | SI                   | 31    | US   |

			Delete Character (1 character):
					Used to indicate deletion (non-printable).
				
					| ASCII | Name |
					| ----- | ---- |
					| 127   | DEL  |
			
			**Extended ASCII (128–255):
						The characters from 128 to 255 are not part of standard ASCII — they belong to what's known as "Extended ASCII".
						
				Important Notes:
						Java uses Unicode (UTF-16) by default — it covers all ASCII and Extended characters.

						You can cast numbers from 0–255 to char and print them in Java.
						
						| Range   | Name           | Characters                              | Standard?                |
						| ------- | -------------- | --------------------------------------- | ------------------------ |
						| 0–127   | ASCII          | Letters, digits, symbols, control chars |  Yes                     |
						| 128–255 | Extended ASCII | Symbols, foreign chars, box-drawing     |  No (encoding-specific)  |

*/
		
	}
}


 