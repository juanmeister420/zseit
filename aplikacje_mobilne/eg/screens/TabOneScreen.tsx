import { StyleSheet, TextInput, Button } from 'react-native';
import { useState, useEffect } from 'react';

import EditScreenInfo from '../components/EditScreenInfo';
import { Text, View } from '../components/Themed';
import { RootTabScreenProps } from '../types';

export default function TabOneScreen({ navigation }: RootTabScreenProps<'TabOne'>) {
  const [email, setEmail] = useState('');
  const [password, setPassword] = useState('');
  const [password2, setPassword2] = useState('');
  const [errors, setErrors] = useState({
    checked: false,
    email: false,
    password_match: false,
  });

  function validateForm() {

    // check if email is valid with regex
    const emailRegex = /^[a-zA-Z0-9]+@[a-zA-Z0-9]+\.[A-Za-z]+$/;
    const emailValid = emailRegex.test(email);

    setErrors({
      ...errors,
      checked: true,
      email: false,
      password_match: false,
    });

    if (!emailValid) {
      setErrors({ ...errors, email: true, checked: false });
    }

    if (password !== password2) {
      setErrors({ ...errors, password_match: true, checked: false });
      return
    }

  }

  return (
    <View style={styles.container}>
      <Text style={styles.title}>Podaj Email</Text>
      <TextInput style={styles.input} placeholder="Podaj Adres Email" value={email}
        onChangeText={text => setEmail(text)}
      />
      <Text style={styles.title}>Podaj Hasło</Text>
      <TextInput style={styles.input} placeholder="Podaj Hasło" value={password}
        onChangeText={text => setPassword(text)}
      />
      <Text style={styles.title}>Powtórz Hasło</Text>
      <TextInput style={styles.input} placeholder="Powtórz Hasło" value={password2}
        onChangeText={text => setPassword2(text)}
      />
      <Button title="Zarejestruj" onPress={validateForm} />
      <Text style={styles.error_box}>
        {errors.email ? 'Nieprawidłowy adres e-mail' : ''}
        {errors.password_match ? 'Hasła się różnią' : ''}
        
      </Text>
      <Text style={styles.error_box}>
      {errors.checked ? `Witaj ${email}` : 'Autor PESEL'}
      </Text>
      


    </View>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    alignItems: 'center',
    justifyContent: 'center',
  },
  title: {
    fontSize: 20,
    fontWeight: 'bold',
  },
  error_box: {
    fontSize: 20,
    fontWeight: 'bold',
    color: 'red',
    marginTop: 20,
  },
  separator: {
    marginVertical: 30,
    height: 1,
    width: '80%',
  },
  input: {
    width: '80%',
    borderRadius: 10,
    height: 40,
    margin: 12,
    borderWidth: 1,
    padding: 10,
  },
});
