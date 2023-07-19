import React from 'react';
import {View, Image, StyleSheet} from 'react-native';
import {vh, vw} from './Constants';

const styles = StyleSheet.create({
    header: {
      alignSelf: 'center',
      marginTop: vh*8,
      marginBottom: vh*8
    },
})

const Header = () => {
    return (
      <View style={styles.header}>
        <Image source={require('../assets/img/logo.png')} style={{height: 120, width: vw*100}} resizeMode='contain'/>
      </View>
    )
}

export default Header;