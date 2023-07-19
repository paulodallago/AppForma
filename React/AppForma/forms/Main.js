import React from 'react';
import {View, StyleSheet} from 'react-native';
import Header from '../components/Header';
import MainButton from '../components/MainButton';
import { ScrollView } from 'react-native-gesture-handler';
import {vh, vw, bgColor, dkBlue, lgBlue} from '../components/Constants';

const styles = StyleSheet.create({
    main: {
        textAlign: 'center', 
        flex: 1,
    },
});

const Main = ({navigation}) => {
    return (
        <ScrollView style={{backgroundColor: bgColor}}>
            <View style={styles.main}>
                <Header/>
                <MainButton btnNome='Clientes' btnMainPress={() => navigation.navigate('Form')}></MainButton>
                <MainButton btnNome='Atividades'></MainButton>
                <MainButton btnNome='Financeiro'></MainButton>
                <MainButton btnNome='Agenda'></MainButton>
            </View>
        </ScrollView>
    )
}

export default Main;