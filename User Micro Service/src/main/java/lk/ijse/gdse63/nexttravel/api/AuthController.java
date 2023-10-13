package lk.ijse.gdse63.nexttravel.api;

import lk.ijse.gdse63.nexttravel.config.JwtUtil;
import lk.ijse.gdse63.nexttravel.dto.UserDTO;
import lk.ijse.gdse63.nexttravel.dto.security.ErrorResponse;
import lk.ijse.gdse63.nexttravel.dto.security.LoginRequest;
import lk.ijse.gdse63.nexttravel.dto.security.LoginResponse;
import lk.ijse.gdse63.nexttravel.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("api/v1/login")
public class AuthController {

    private final AuthenticationManager authenticationManager;
    @Autowired // aluthen object hada hada inn oni ne . spring laga thyn ewa aran dagannawa
    private UserService userService;

    private JwtUtil jwtUtil;
    public AuthController(AuthenticationManager authenticationManager , JwtUtil jwtUtil ) {
        this.authenticationManager =authenticationManager;
        this.jwtUtil = jwtUtil;
    }

    @ResponseBody
    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity login(@RequestBody LoginRequest loginRequest){

        try{
            Authentication authentication =
                    authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(loginRequest.getEmail(), loginRequest.getPassword()));
            String email = authentication.getName();
            UserDTO user = new UserDTO();
            user.setEmail(loginRequest.getEmail());
            user.setPassword(loginRequest.getPassword());
            String token = jwtUtil.createToken(user);
            LoginResponse loginResponse = new LoginResponse(email , token);
            return ResponseEntity.ok(loginResponse);
        }catch (BadCredentialsException e ){
            ErrorResponse errorResponse = new ErrorResponse(HttpStatus.BAD_REQUEST, "Invalid username or password");
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorResponse);
        }catch (Exception e){
            ErrorResponse errorResponse = new ErrorResponse(HttpStatus.BAD_REQUEST, e.getMessage());
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorResponse);
        }
    }

}
