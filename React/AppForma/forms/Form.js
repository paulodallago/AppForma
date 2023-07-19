import React, {useEffect} from 'react';
import {View, StyleSheet, Alert} from 'react-native';
import Header from '../components/Header';
import TextField from '../components/TextField';
import { ScrollView } from 'react-native-gesture-handler';
import {vh, vw, bgColor, dkBlue, lgBlue} from '../components/Constants';
import SimpleButton from '../components/SimpleButton';
import { useForm } from 'react-hook-form';
import * as yup from 'yup';

const onSubmit = (data) => Alert.alert(data.nome + " | " + data.cpf);

const styles = StyleSheet.create({
  main: {
    width: vw*80,
    alignSelf: 'center',
    flex: 1,
  },
})

const fieldValidationSchema = yup.object().shape({
  nome: yup
    .string()
    .required('O nome não pode ser vazio')
})

const Form = ({navigation}) =>  {
  const { register, setValue, handleSubmit } = useForm({validationSchema: fieldValidationSchema});
  useEffect(() => {
    register('nome')
  }, [register]);
  return (
    <ScrollView style={{backgroundColor: bgColor}}>
      <View style={styles.main}>
        <Header/>
        <TextField text="Nome" onChangeText={text => setValue('nome', text)} keyboard="default"/>
        <TextField text="CPF" onChangeText={text => setValue('cpf', text)} keyboard="numeric"/>
        <TextField text="Email" onChangeText={text => setValue('email', text)} keyboard="email-address"/>
        <TextField text="Senha" onChangeText={text => setValue('senha', text)} keyboard="default"/>
        <SimpleButton btnNome="Enviar" btnSimplePress={handleSubmit(onSubmit)}/>
      </View>
    </ScrollView>
  );
}

export default Form;