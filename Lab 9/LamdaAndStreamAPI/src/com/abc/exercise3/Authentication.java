package com.abc.exercise3;

@FunctionalInterface
interface Authentication 
{
	boolean checkIdentity(String username, String password);
}
