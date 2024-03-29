package myproject.ekampus.business.dtos.requests;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UploadStudentImageRequest {

	@NotNull
	@NotBlank
	private int studentId;
	
	@NotNull
	@NotBlank
	private byte[] studentPhoto;
}
