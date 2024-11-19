package 
com.learn.Ecommerce.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learn.Ecommerce.Dto.UserDto;
import com.learn.Ecommerce.entity.User;
import com.learn.Ecommerce.repository.UserRepository;

@Service
public class UsereServiceImpl implements UserService {
	@Autowired
    UserRepository userRepository;
	
	@Override
	public UserDto adduser(UserDto userDto) {
		UUID randomUUID = UUID.randomUUID();
		String id = randomUUID.toString();
		
//        userDto.setId(UUID.randomUUID().toString());  he pn aapn banu shktto
		
		userDto.setId(id);
		
	User user = dtoTOEntity(userDto);
		User saveUser = userRepository.save(user);
		
		UserDto savedto = entityToDto(saveUser);
		
		return savedto;
	}

	@Override
	public List<UserDto> getAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserDto getUserById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserDto updateUser(String id, UserDto userDto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteUser(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserDto entityToDto(User user) {
		UserDto userDto=new UserDto();
		userDto.setId(user.getId());
		userDto.setFirstName(user.getFirstName());
		userDto.setLastName(user.getLasttName());
		userDto.setPassword(user.getPassword());
		userDto.setEmailId(user.getEmailId());
		userDto.setAge(user.getAge());
		
		
		return userDto ;
	}

	@Override
	public User dtoTOEntity(UserDto userDto) {
		
	User user=new User();
	user.setAge(userDto.getAge());
	user.setEmailId(userDto.getEmailId());
	user.setFirstName(userDto.getFirstName());
	user.setId(userDto.getId());
	user.setLasttName(userDto.getLastName());
	user.setPassword(userDto.getPassword());
		return user;
	}

}
