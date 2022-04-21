add. Poly(A, B) 
// 주어진 두 다항식 A와 B를 더하여 결과 다항식 C를 반환하는 알고리즘 
	C ← zero. P(); 
	while (not is. Zero. P(A) and not is. Zero. P(B)) do { 
	case { 
		max. Exp(A) < max. Exp(B) : 
			C ← add. Term(C, coef(B, max. Exp(B)); 
			B ← del. Term(B, max. Exp(B)); 
			max. Exp(A) = max. Exp(B) : 
				sum ← coef(A, max. Exp(A)) + coef(B, max. Exp(B)); 
				if (sum≠ 0) then C ← add. Term(C, sum, max. Exp(A)); 
				A ← del. Term(A, max. Exp(A)); 
				B ← del. Term(B, max. Exp(B)); 
			max. Exp(A) > max. Exp(B) : 
					C ← add. Term(C, coef(A, max. Exp(A)); 
					A ← del. Term(A, max. Exp(A)); 
					} 
		}
