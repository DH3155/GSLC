package GSLC;
// Here is the Interface class,
// interface classes are the classes which gives the "rule title"
// without giving the set of rules to follow
// in this case, the "rule titles" are

// GetSize
// GetPrice
// GetGender

// These rules are the rules that needs to be fulfilled / implemented by the objects


interface actions {
	int GetSize();
	int GetPrice();
	void GetGender();
}