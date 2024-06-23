package com.office.library.config;

import com.office.library.user.member.UserMemberLoginInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new UserMemberLoginInterceptor())
                .addPathPatterns(
                        "/book/user/rentalBookConfirm",
                        "/book/user/enterBookshelf",
                        "/book/user/listupRentalBookHistory",
                        "/book/user/request/HopeBookForm",
                        "/user/member/modifyAccountForm",
                        "/user/member/modifyAccountConfirm");
//                .excludePathPatterns("/css/**", "/*.ico", "/error");
    }

    @Override
    public void  addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/libraryUploadImg/**") // --1
                .addResourceLocations("file:///C:/library/upload/"); //--2
    }
}
